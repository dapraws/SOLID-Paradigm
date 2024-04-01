package com.dicoding.kotlin

interface ProductService {
    fun getProduct(id: String)
    fun calculateProductPrice()
}

class ProductServiceImpl() : ProductService{
    override fun getProduct(id: String) {
        // Implementation code
    }
    override fun calculateProductPrice() {
        // Implementation code
    }
}