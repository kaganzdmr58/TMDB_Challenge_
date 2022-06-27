package com.cbagames.tmdb_challenge.databinding;
import com.cbagames.tmdb_challenge.R;
import com.cbagames.tmdb_challenge.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMovieDetailBindingImpl extends ActivityMovieDetailBinding implements com.cbagames.tmdb_challenge.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView2, 7);
        sViewsWithIds.put(R.id.linearLayoutView, 8);
        sViewsWithIds.put(R.id.ivBackground, 9);
        sViewsWithIds.put(R.id.ivPersonImage, 10);
        sViewsWithIds.put(R.id.textView2, 11);
        sViewsWithIds.put(R.id.textView4, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMovieDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityMovieDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.RatingBar) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.ScrollView) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.ratingBar.setTag(null);
        this.rvCast.setTag(null);
        this.rvVideosMovieDetail.setTag(null);
        this.tvCast.setTag(null);
        this.tvName.setTag(null);
        this.tvSummary.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.cbagames.tmdb_challenge.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.raiting == variableId) {
            setRaiting((java.lang.Float) variable);
        }
        else if (BR.movieDetailObject == variableId) {
            setMovieDetailObject((com.cbagames.tmdb_challenge.DetailActivity) variable);
        }
        else if (BR.videosDetailAdapter == variableId) {
            setVideosDetailAdapter((com.cbagames.tmdb_challenge.DetailVideosAdapter) variable);
        }
        else if (BR.detailData == variableId) {
            setDetailData((com.cbagames.tmdb_challenge.Movies) variable);
        }
        else if (BR.PersonCastDetailAdapter == variableId) {
            setPersonCastDetailAdapter((com.cbagames.tmdb_challenge.DetailCastAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRaiting(@Nullable java.lang.Float Raiting) {
        this.mRaiting = Raiting;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.raiting);
        super.requestRebind();
    }
    public void setMovieDetailObject(@Nullable com.cbagames.tmdb_challenge.DetailActivity MovieDetailObject) {
        this.mMovieDetailObject = MovieDetailObject;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.movieDetailObject);
        super.requestRebind();
    }
    public void setVideosDetailAdapter(@Nullable com.cbagames.tmdb_challenge.DetailVideosAdapter VideosDetailAdapter) {
        this.mVideosDetailAdapter = VideosDetailAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.videosDetailAdapter);
        super.requestRebind();
    }
    public void setDetailData(@Nullable com.cbagames.tmdb_challenge.Movies DetailData) {
        this.mDetailData = DetailData;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.detailData);
        super.requestRebind();
    }
    public void setPersonCastDetailAdapter(@Nullable com.cbagames.tmdb_challenge.DetailCastAdapter PersonCastDetailAdapter) {
        this.mPersonCastDetailAdapter = PersonCastDetailAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.PersonCastDetailAdapter);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.Float raiting = mRaiting;
        float androidxDatabindingViewDataBindingSafeUnboxRaiting = 0f;
        com.cbagames.tmdb_challenge.DetailActivity movieDetailObject = mMovieDetailObject;
        java.lang.String detailDataTitle = null;
        java.lang.String detailDataOverview = null;
        com.cbagames.tmdb_challenge.DetailVideosAdapter videosDetailAdapter = mVideosDetailAdapter;
        com.cbagames.tmdb_challenge.Movies detailData = mDetailData;
        com.cbagames.tmdb_challenge.DetailCastAdapter personCastDetailAdapter = mPersonCastDetailAdapter;

        if ((dirtyFlags & 0x21L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(raiting)
                androidxDatabindingViewDataBindingSafeUnboxRaiting = androidx.databinding.ViewDataBinding.safeUnbox(raiting);
        }
        if ((dirtyFlags & 0x24L) != 0) {
        }
        if ((dirtyFlags & 0x28L) != 0) {



                if (detailData != null) {
                    // read detailData.title
                    detailDataTitle = detailData.getTitle();
                    // read detailData.overview
                    detailDataOverview = detailData.getOverview();
                }
        }
        if ((dirtyFlags & 0x30L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            androidx.databinding.adapters.RatingBarBindingAdapter.setRating(this.ratingBar, androidxDatabindingViewDataBindingSafeUnboxRaiting);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.rvCast.setAdapter(personCastDetailAdapter);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            this.rvVideosMovieDetail.setAdapter(videosDetailAdapter);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.tvCast.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, detailDataTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSummary, detailDataOverview);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // movieDetailObject != null
        boolean movieDetailObjectJavaLangObjectNull = false;
        // detailData
        com.cbagames.tmdb_challenge.Movies detailData = mDetailData;
        // movieDetailObject
        com.cbagames.tmdb_challenge.DetailActivity movieDetailObject = mMovieDetailObject;



        movieDetailObjectJavaLangObjectNull = (movieDetailObject) != (null);
        if (movieDetailObjectJavaLangObjectNull) {



            movieDetailObject.translate(detailData);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): raiting
        flag 1 (0x2L): movieDetailObject
        flag 2 (0x3L): videosDetailAdapter
        flag 3 (0x4L): detailData
        flag 4 (0x5L): PersonCastDetailAdapter
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}