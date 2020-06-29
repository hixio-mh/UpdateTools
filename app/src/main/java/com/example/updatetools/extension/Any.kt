package extension

import android.util.Log
import androidx.core.content.ContextCompat
import com.example.updatetools.update.UpdateAppUtils
import com.example.updatetools.util.GlobalContextProvider

/**
 * desc: Any 扩展
 * author: teprinciple on 2019-06-03.
 */
val Any.TAG: String
    get() = this::class.java.simpleName

/**
 * 打印日志
 */
fun Any.log(content: String?) {
    UpdateAppUtils.updateInfo.config.isDebug.yes {
        Log.e("[UpdateAppUtils]", content)
    }
}

/**
 * 获取color
 */
fun Any.color(color: Int) = ContextCompat.getColor(GlobalContextProvider.getGlobalContext(), color)

/**
 * 获取 String
 */
fun Any.string(string: Int) = GlobalContextProvider.getGlobalContext().getString(string)
