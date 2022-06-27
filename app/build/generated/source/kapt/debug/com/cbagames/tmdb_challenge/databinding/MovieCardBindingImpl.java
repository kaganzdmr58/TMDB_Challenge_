package com.cbagames.tmdb_challenge.databinding;
import com.cbagames.tmdb_challenge.R;
import com.cbagames.tmdb_challenge.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MovieCardBindingImpl extends MovieCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardViewMovie, 3);
        sViewsWithIds.put(R.id.imageViewPictures, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MovieCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private MovieCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewHeader.setTag(null);
        this.textViewNfo.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.movieCard == variableId) {
            setMovieCard((com.cbagames.tmdb_challenge.Cards) variable);
        }
        else if (BR.UTILS == variableId) {
            setUTILS((com.cbagames.tmdb_challenge.Utils) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMovieCard(@Nullable com.cbagames.tmdb_challenge.Cards MovieCard) {
        this.mMovieCard = MovieCard;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.movieCard);
        super.requestRebind();
    }
    public void setUTILS(@Nullable com.cbagames.tmdb_challenge.Utils UTILS) {
        this.mUTILS = UTILS;
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
        java.lang.String movieCardTitle = null;
        boolean movieCardOverviewLengthInt180 = false;
        int movieCardOverviewLength = 0;
        java.lang.String movieCardOverview = null;
        com.cbagames.tmdb_challenge.Cards movieCard = mMovieCard;
        java.lang.CharSequence movieCardOverviewLengthInt180MovieCardOverviewSubSequenceInt0Int179MovieCardOverview = null;
        java.lang.CharSequence movieCardOverviewSubSequenceInt0Int179 = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (movieCard != null) {
                    // read movieCard.title
                    movieCardTitle = movieCard.getTitle();
                    // read movieCard.overview
                    movieCardOverview = movieCard.getOverview();
                }


                if (movieCardOverview != null) {
                    // read movieCard.overview.length()
                    movieCardOverviewLength = movieCardOverview.length();
                }


                // read movieCard.overview.length() > 180
                movieCardOverviewLengthInt180 = (movieCardOverviewLength) > (180);
            if((dirtyFlags & 0x5L) != 0) {
                if(movieCardOverviewLengthInt180) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10L) != 0) {

                if (movieCardOverview != null) {
                    // read movieCard.overview.subSequence(0, 179)
                    movieCardOverviewSubSequenceInt0Int179 = movieCardOverview.subSequence(0, 179);
                }
        }

        if ((dirtyFlags & 0x5L) != 0) {

                // read movieCard.overview.length() > 180 ? movieCard.overview.subSequence(0, 179) : movieCard.overview
                movieCardOverviewLengthInt180MovieCardOverviewSubSequenceInt0Int179MovieCardOverview = ((movieCardOverviewLengthInt180) ? (movieCardOverviewSubSequenceInt0Int179) : (movieCardOverview));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewHeader, movieCardTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewNfo, movieCardOverviewLengthInt180MovieCardOverviewSubSequenceInt0Int179MovieCardOverview);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): movieCard
        flag 1 (0x2L): UTILS
        flag 2 (0x3L): null
        flag 3 (0x4L): movieCard.overview.length() > 180 ? movieCard.overview.subSequence(0, 179) : movieCard.overview
        flag 4 (0x5L): movieCard.overview.length() > 180 ? movieCard.overview.subSequence(0, 179) : movieCard.overview
    flag mapping end*/
    //end
}