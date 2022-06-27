package com.cbagames.tmdb_challenge;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.cbagames.tmdb_challenge.databinding.ActivityMainBindingImpl;
import com.cbagames.tmdb_challenge.databinding.ActivityMovieDetailBindingImpl;
import com.cbagames.tmdb_challenge.databinding.ActivityPersonDetailBindingImpl;
import com.cbagames.tmdb_challenge.databinding.DetailCastCardBindingImpl;
import com.cbagames.tmdb_challenge.databinding.DetailVideosCardBindingImpl;
import com.cbagames.tmdb_challenge.databinding.MovieCardBindingImpl;
import com.cbagames.tmdb_challenge.databinding.PersonMoviesCardBindingImpl;
import com.cbagames.tmdb_challenge.databinding.PersonTvCardBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYMOVIEDETAIL = 2;

  private static final int LAYOUT_ACTIVITYPERSONDETAIL = 3;

  private static final int LAYOUT_DETAILCASTCARD = 4;

  private static final int LAYOUT_DETAILVIDEOSCARD = 5;

  private static final int LAYOUT_MOVIECARD = 6;

  private static final int LAYOUT_PERSONMOVIESCARD = 7;

  private static final int LAYOUT_PERSONTVCARD = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cbagames.tmdb_challenge.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cbagames.tmdb_challenge.R.layout.activity_movie_detail, LAYOUT_ACTIVITYMOVIEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cbagames.tmdb_challenge.R.layout.activity_person_detail, LAYOUT_ACTIVITYPERSONDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cbagames.tmdb_challenge.R.layout.detail_cast_card, LAYOUT_DETAILCASTCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cbagames.tmdb_challenge.R.layout.detail_videos_card, LAYOUT_DETAILVIDEOSCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cbagames.tmdb_challenge.R.layout.movie_card, LAYOUT_MOVIECARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cbagames.tmdb_challenge.R.layout.person_movies_card, LAYOUT_PERSONMOVIESCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.cbagames.tmdb_challenge.R.layout.person_tv_card, LAYOUT_PERSONTVCARD);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMOVIEDETAIL: {
          if ("layout/activity_movie_detail_0".equals(tag)) {
            return new ActivityMovieDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_movie_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPERSONDETAIL: {
          if ("layout/activity_person_detail_0".equals(tag)) {
            return new ActivityPersonDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_person_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_DETAILCASTCARD: {
          if ("layout/detail_cast_card_0".equals(tag)) {
            return new DetailCastCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for detail_cast_card is invalid. Received: " + tag);
        }
        case  LAYOUT_DETAILVIDEOSCARD: {
          if ("layout/detail_videos_card_0".equals(tag)) {
            return new DetailVideosCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for detail_videos_card is invalid. Received: " + tag);
        }
        case  LAYOUT_MOVIECARD: {
          if ("layout/movie_card_0".equals(tag)) {
            return new MovieCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for movie_card is invalid. Received: " + tag);
        }
        case  LAYOUT_PERSONMOVIESCARD: {
          if ("layout/person_movies_card_0".equals(tag)) {
            return new PersonMoviesCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for person_movies_card is invalid. Received: " + tag);
        }
        case  LAYOUT_PERSONTVCARD: {
          if ("layout/person_tv_card_0".equals(tag)) {
            return new PersonTvCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for person_tv_card is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(18);

    static {
      sKeys.put(1, "PersonCastDetailAdapter");
      sKeys.put(2, "PersonMovieCard");
      sKeys.put(3, "UTILS");
      sKeys.put(0, "_all");
      sKeys.put(4, "byography");
      sKeys.put(5, "detailCasdCard");
      sKeys.put(6, "detailData");
      sKeys.put(7, "detailVideosCard");
      sKeys.put(8, "mainActivityObject");
      sKeys.put(9, "movieCard");
      sKeys.put(10, "movieDetailObject");
      sKeys.put(11, "moviesAdapter");
      sKeys.put(12, "personDetail");
      sKeys.put(13, "personMovieAdapter");
      sKeys.put(14, "personTVAdapter");
      sKeys.put(15, "personTVCardVideo");
      sKeys.put(16, "raiting");
      sKeys.put(17, "videosDetailAdapter");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_main_0", com.cbagames.tmdb_challenge.R.layout.activity_main);
      sKeys.put("layout/activity_movie_detail_0", com.cbagames.tmdb_challenge.R.layout.activity_movie_detail);
      sKeys.put("layout/activity_person_detail_0", com.cbagames.tmdb_challenge.R.layout.activity_person_detail);
      sKeys.put("layout/detail_cast_card_0", com.cbagames.tmdb_challenge.R.layout.detail_cast_card);
      sKeys.put("layout/detail_videos_card_0", com.cbagames.tmdb_challenge.R.layout.detail_videos_card);
      sKeys.put("layout/movie_card_0", com.cbagames.tmdb_challenge.R.layout.movie_card);
      sKeys.put("layout/person_movies_card_0", com.cbagames.tmdb_challenge.R.layout.person_movies_card);
      sKeys.put("layout/person_tv_card_0", com.cbagames.tmdb_challenge.R.layout.person_tv_card);
    }
  }
}
