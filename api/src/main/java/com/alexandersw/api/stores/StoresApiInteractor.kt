package com.alexandersw.api.stores

import com.alexandersw.common.UseCaseResponse

interface StoresApiInteractor {
    // The location is retrieved from the user stored data
    suspend fun getStores(): UseCaseResponse<List<Store>>
    suspend fun getCatalogue(from: Store): UseCaseResponse<Catalogue>
    suspend fun getStoreById(id: Int): UseCaseResponse<Store>
    suspend fun getProductById(id: Int): UseCaseResponse<Product>
}
