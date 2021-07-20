package ski.chrzanow.foldableprojectview

import com.intellij.AbstractBundle
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.PropertyKey

@NonNls
object FoldableProjectViewBundle : AbstractBundle("messages.FoldableProjectView") {

    @NonNls
    const val BUNDLE = "messages.FoldableProjectView"

    const val PROJECT_VIEW_FOLDING_ENABLED = "projectViewFoldingEnabled"

    @Suppress("SpreadOperator")
    @JvmStatic
    fun message(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any) =
        getMessage(key, *params)

    @Suppress("SpreadOperator")
    @JvmStatic
    fun messagePointer(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any) =
        getLazyMessage(key, *params)
}
