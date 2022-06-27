// Generated by data binding compiler. Do not edit!
package com.cbagames.tmdb_challenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.cbagames.tmdb_challenge.Cards;
import com.cbagames.tmdb_challenge.R;
import com.cbagames.tmdb_challenge.Utils;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MovieCardBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardViewMovie;

  @NonNull
  public final ImageView imageViewPictures;

  @NonNull
  public final TextView textViewHeader;

  @NonNull
  public final TextView textViewNfo;

  @Bindable
  protected Cards mMovieCard;

  @Bindable
  protected Utils mUTILS;

  protected MovieCardBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardViewMovie, ImageView imageViewPictures, TextView textViewHeader,
      TextView textViewNfo) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardViewMovie = cardViewMovie;
    this.imageViewPictures = imageViewPictures;
    this.textViewHeader = textViewHeader;
    this.textViewNfo = textViewNfo;
  }

  public abstract void setMovieCard(@Nullable Cards movieCard);

  @Nullable
  public Cards getMovieCard() {
    return mMovieCard;
  }

  public abstract void setUTILS(@Nullable Utils UTILS);

  @Nullable
  public Utils getUTILS() {
    return mUTILS;
  }

  @NonNull
  public static MovieCardBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.movie_card, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MovieCardBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MovieCardBinding>inflateInternal(inflater, R.layout.movie_card, root, attachToRoot, component);
  }

  @NonNull
  public static MovieCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.movie_card, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MovieCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MovieCardBinding>inflateInternal(inflater, R.layout.movie_card, null, false, component);
  }

  public static MovieCardBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static MovieCardBinding bind(@NonNull View view, @Nullable Object component) {
    return (MovieCardBinding)bind(component, view, R.layout.movie_card);
  }
}