package com.example.awrealestate.wire;

import com.example.data.network.wire.WireService;
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
public final class WireViewModel_Factory implements Factory<WireViewModel> {
  private final Provider<WireService> serviceProvider;

  public WireViewModel_Factory(Provider<WireService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public WireViewModel get() {
    return newInstance(serviceProvider.get());
  }

  public static WireViewModel_Factory create(Provider<WireService> serviceProvider) {
    return new WireViewModel_Factory(serviceProvider);
  }

  public static WireViewModel newInstance(WireService service) {
    return new WireViewModel(service);
  }
}
