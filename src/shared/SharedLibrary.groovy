package shared

import shared.utils.CommonUtils

class SharedLibrary {
    static void sharedMethod() {
        CommonUtils.logInfo('This is a shared method')
    }
}
