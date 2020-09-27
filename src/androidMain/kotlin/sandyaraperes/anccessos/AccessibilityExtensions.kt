package sandyaraperes.anccessos

import android.view.View
import androidx.core.view.ViewCompat

actual class AccessibilityExtensions : AccessibilityExtensionsDelegate() {

    private fun View?.setAccessibility(
            className: CharSequence? = null,
            contentDescription: String? = null,
            isHeading: Boolean? = false,
            isPassword: Boolean? = false,
            isChecked: Boolean? = false,
            isEnabled: Boolean? = false,
            isClickable: Boolean? = false,
            isLongClickable: Boolean? = false,
            isSelected: Boolean? = false,
            delegate: AccessibilityExtensionsDelegate = AccessibilityExtensionsDelegate()
    ){
        delegate.run {
            this@setAccessibility?.let { ViewCompat.setAccessibilityDelegate(it, this) }
        }
    }

    actual fun setAccessibility(view: Any?) {
        try{
            (view as View).setAccessibility()
        } catch(e: Exception){
            throw NullPointerException("Have you forgot to set on a View component?")
        }
    }
}