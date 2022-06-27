// Generated by data binding compiler. Do not edit!
package com.cbagames.tmdb_challenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.cbagames.tmdb_challenge.PersomMoviesAdapter;
import com.cbagames.tmdb_challenge.Person;
import com.cbagames.tmdb_challenge.PersonTvAdapter;
import com.cbagames.tmdb_challenge.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityPersonDetailBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivBackground;

  @NonNull
  public final ImageView ivPersonImage;

  @NonNull
  public final LinearLayout linearLayoutView;

  @NonNull
  public final RecyclerView rvMoviePerson;

  @NonNull
  public final RecyclerView rvTv;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView22;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView tvName;

  @Bindable
  protected Person mPersonDetail;

  @Bindable
  protected PersomMoviesAdapter mPersonMovieAdapter;

  @Bindable
  protected PersonTvAdapter mPersonTVAdapter;

  @Bindable
  protected String mByography;

  protected ActivityPersonDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivBackground, ImageView ivPersonImage, LinearLayout linearLayoutView,
      RecyclerView rvMoviePerson, RecyclerView rvTv, ScrollView scrollView2, TextView textView2,
      TextView textView22, TextView textView3, TextView textView4, TextView textView5,
      TextView tvName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivBackground = ivBackground;
    this.ivPersonImage = ivPersonImage;
    this.linearLayoutView = linearLayoutView;
    this.rvMoviePerson = rvMoviePerson;
    this.rvTv = rvTv;
    this.scrollView2 = scrollView2;
    this.textView2 = textView2;
    this.textView22 = textView22;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.tvName = tvName;
  }

  public abstract void setPersonDetail(@Nullable Person personDetail);

  @Nullable
  public Person getPersonDetail() {
    return mPersonDetail;
  }

  public abstract void setPersonMovieAdapter(@Nullable PersomMoviesAdapter personMovieAdapter);

  @Nullable
  public PersomMoviesAdapter getPersonMovieAdapter() {
    return mPersonMovieAdapter;
  }

  public abstract void setPersonTVAdapter(@Nullable PersonTvAdapter personTVAdapter);

  @Nullable
  public PersonTvAdapter getPersonTVAdapter() {
    return mPersonTVAdapter;
  }

  public abstract void setByography(@Nullable String byography);

  @Nullable
  public String getByography() {
    return mByography;
  }

  @NonNull
  public static ActivityPersonDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_person_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPersonDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityPersonDetailBinding>inflateInternal(inflater, R.layout.activity_person_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityPersonDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_person_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPersonDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityPersonDetailBinding>inflateInternal(inflater, R.layout.activity_person_detail, null, false, component);
  }

  public static ActivityPersonDetailBinding bind(@NonNull View view) {
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
  public static ActivityPersonDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityPersonDetailBinding)bind(component, view, R.layout.activity_person_detail);
  }
}
