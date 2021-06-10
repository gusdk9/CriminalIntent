package com.bignerdranch.android.criminalintent

import android.graphics.Bitmap
import android.graphics.BitmapFactory

fun getScaledBitmap(path: String, destWidth: Int, destHeight: Int): Bitmap {
    // 이미지 파일의 크기를 읽는다.
    var options = BitmapFactory.Options()
    options.inJustDecodeBounds = true
    BitmapFactory.decodeFile(path, options)

    val srcWidth = options.outWidth.toFloat()
    val srcHeight = options.outHeight.toFloat()

    // 크기를 얼마나 줄일지 파악한다
    var inSampleSize = 1
    if (srcHeight > destHeight) {

    }

}