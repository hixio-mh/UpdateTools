package com.example.updatetools.util

import android.app.Activity
import android.app.AlertDialog
import com.example.updatetools.R
import com.example.updatetools.util.GlobalContextProvider

/**
 * desc: AlertDialogUtil
 * time: 2018/8/20
 * @author teprinciple
 */
internal object AlertDialogUtil {

    fun show(
        activity: Activity,
        message: String,
        onCancelClick: () -> Unit = {},
        onSureClick: () -> Unit = {},
        cancelable: Boolean = false,
        title: String = GlobalContextProvider.getGlobalContext().getString(R.string.notice),
        cancelText: String = GlobalContextProvider.getGlobalContext().getString(R.string.cancel),
        sureText: String = GlobalContextProvider.getGlobalContext().getString(R.string.sure)
    ) {
        AlertDialog.Builder(activity, R.style.AlertDialog)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton(sureText) { _, _ ->
                onSureClick.invoke()
            }
            .setNegativeButton(cancelText) { _, _ ->
                onCancelClick.invoke()
            }
            .setCancelable(cancelable)
            .create()
            .show()
    }
}