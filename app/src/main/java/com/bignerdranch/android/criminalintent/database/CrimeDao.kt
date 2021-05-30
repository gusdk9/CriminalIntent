package com.bignerdranch.android.criminalintent.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.bignerdranch.android.criminalintent.Crime
import java.util.*

/**
 * DAO 는 데이터베이스 작업을 수행하는 함수들을 포함하는 인터페이스이다
 */
@Dao
interface CrimeDao {

    @Query("SELECT * FROM crime")
    fun getCrimes(): LiveData<List<Crime>>

    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): LiveData<Crime?>

    // 변경이나 추가의 경우에는 Room 이 백그라운드 스레드로 자동 실행하지 못한다
    // 여기서는 Executors 를 직접 구현할 수 없다. 이 인터페이스를 기반으로 Room 이 함수를 자동 생성하기 때문이다
    @Update
    fun updateCrime(crime: Crime)

    @Insert
    fun addCrime(crime: Crime)
}