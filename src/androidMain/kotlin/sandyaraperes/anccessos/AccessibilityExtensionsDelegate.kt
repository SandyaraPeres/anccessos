package sandyaraperes.anccessos
import androidx.core.view.AccessibilityDelegateCompat
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import android.view.View

open class AccessibilityExtensionsDelegate  : AccessibilityDelegateCompat() {
    private var className: CharSequence? = null
    private var contentDescription: String? = null
    private var isHeading: Boolean? = false
    private var isPassword: Boolean? = false
    private var isChecked: Boolean? = false
    private var isEnabled: Boolean? = false
    private var isClickable: Boolean? = false
    private var isLongClickable: Boolean? = false
    private var isSelected: Boolean? = false

    override fun onInitializeAccessibilityNodeInfo(host: View, info: AccessibilityNodeInfoCompat){
        super.onInitializeAccessibilityNodeInfo(host, info)
        className?.let{ info.className = it }
        contentDescription?.let{ info.contentDescription = it }

        isHeading?.let{ info.isHeading = it }
        isPassword?.let{ info.isPassword = it }

        isChecked?.let{
            info.isCheckable = true
            info.isChecked = it
        }

        isEnabled?.let{ info.isEnabled = it }
        isClickable?.let { info.isClickable = it }
        isLongClickable?.let { info.isLongClickable = it }
        isSelected?.let { info.isSelected = it }
    }
}