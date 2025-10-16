package com.example.libreria_de_horror.api.repositorio.repo.repositorio

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ProveerAlmacenJsonPlaceholder{
    @Provides
    @Singleton
    fun crea_un_almacen_placeholder(): InterfazAlmacenPlaceholder {
        return AlmacenPlaceholder()
    }
}