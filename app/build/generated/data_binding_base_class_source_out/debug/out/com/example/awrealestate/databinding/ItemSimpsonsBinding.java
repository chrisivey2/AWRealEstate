// Generated by view binder compiler. Do not edit!
package com.example.awrealestate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.awrealestate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemSimpsonsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView tvSecondUrl;

  @NonNull
  public final TextView tvSimpsonsIcon;

  @NonNull
  public final TextView tvSimpsonsResult;

  @NonNull
  public final TextView tvSimpsonsText;

  private ItemSimpsonsBinding(@NonNull ConstraintLayout rootView, @NonNull TextView tvSecondUrl,
      @NonNull TextView tvSimpsonsIcon, @NonNull TextView tvSimpsonsResult,
      @NonNull TextView tvSimpsonsText) {
    this.rootView = rootView;
    this.tvSecondUrl = tvSecondUrl;
    this.tvSimpsonsIcon = tvSimpsonsIcon;
    this.tvSimpsonsResult = tvSimpsonsResult;
    this.tvSimpsonsText = tvSimpsonsText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSimpsonsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSimpsonsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_simpsons, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSimpsonsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv_second_url;
      TextView tvSecondUrl = ViewBindings.findChildViewById(rootView, id);
      if (tvSecondUrl == null) {
        break missingId;
      }

      id = R.id.tv_simpsons_icon;
      TextView tvSimpsonsIcon = ViewBindings.findChildViewById(rootView, id);
      if (tvSimpsonsIcon == null) {
        break missingId;
      }

      id = R.id.tv_simpsons_result;
      TextView tvSimpsonsResult = ViewBindings.findChildViewById(rootView, id);
      if (tvSimpsonsResult == null) {
        break missingId;
      }

      id = R.id.tv_simpsons_text;
      TextView tvSimpsonsText = ViewBindings.findChildViewById(rootView, id);
      if (tvSimpsonsText == null) {
        break missingId;
      }

      return new ItemSimpsonsBinding((ConstraintLayout) rootView, tvSecondUrl, tvSimpsonsIcon,
          tvSimpsonsResult, tvSimpsonsText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
