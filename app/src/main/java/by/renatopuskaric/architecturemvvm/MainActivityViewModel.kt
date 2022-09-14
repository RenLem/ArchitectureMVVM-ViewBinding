package by.renatopuskaric.architecturemvvm

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    var displyed = 0
    fun upAdd(): Int {
        return displyed++
    }


}