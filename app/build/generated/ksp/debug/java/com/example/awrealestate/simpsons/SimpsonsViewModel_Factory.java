package com.example.awrealestate.simpsons;

import com.example.data.network.simpsons.SimpsonsService;
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
public final class SimpsonsViewModel_Factory implements Factory<SimpsonsViewModel> {
  private final Provider<SimpsonsService> serviceProvider;

  public SimpsonsViewModel_Factory(Provider<SimpsonsService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public SimpsonsViewModel get() {
    return newInstance(serviceProvider.get());
  }

  public static SimpsonsViewModel_Factory create(Provider<SimpsonsService> serviceProvider) {
    return new SimpsonsViewModel_Factory(serviceProvider);
  }

  public static SimpsonsViewModel newInstance(SimpsonsService service) {
    return new SimpsonsViewModel(service);
  }
}
