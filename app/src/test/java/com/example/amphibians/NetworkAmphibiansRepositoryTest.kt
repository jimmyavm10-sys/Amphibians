package com.example.amphibians

import com.example.amphibians.data.NetworkAmphibiansRepository
import com.example.amphibians.fake.FakeAmphibiansApiService
import com.example.amphibians.fake.FakeDataSource
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class NetworkAmphibiansRepositoryTest {

    @Test
    fun networkAmphibiansRepository_getAmphibians_verifyAmphibiansList() =
        runTest {
            val repository = NetworkAmphibiansRepository(FakeAmphibiansApiService())
            assertEquals(FakeDataSource.amphibiansList, repository.getAmphibians())
        }
}
