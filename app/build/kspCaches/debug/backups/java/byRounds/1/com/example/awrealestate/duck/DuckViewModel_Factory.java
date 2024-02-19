package com.example.awrealestate.duck;

import com.example.data.network.duck.DuckService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DuckViewModel_Factory implements Factory<DuckViewModel> {
  private final Provider<DuckService> serviceProvider;

  public DuckViewModel_Factory(Provider<DuckService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public DuckViewModel get() {
    return newInstance(serviceProvider.get());
  }

  public static DuckViewModel_Factory create(Provider<DuckService> serviceProvider) {
    return new DuckViewModel_Factory(serviceProvider);
  }

  public static DuckViewModel newInstance(DuckService service) {
    return new DuckViewModel(service);
  }
}
