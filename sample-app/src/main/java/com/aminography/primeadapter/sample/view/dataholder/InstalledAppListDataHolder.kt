package com.aminography.primeadapter.sample.view.dataholder

import com.aminography.primeadapter.sample.logic.InstalledAppData
import com.aminography.primeadapter.PrimeDataHolder
import com.aminography.primeadapter.annotation.DataHolder

/**
 * Created by aminography on 8/17/2018.
 */
@DataHolder
data class InstalledAppListDataHolder(
        val installedAppData: InstalledAppData
) : PrimeDataHolder()