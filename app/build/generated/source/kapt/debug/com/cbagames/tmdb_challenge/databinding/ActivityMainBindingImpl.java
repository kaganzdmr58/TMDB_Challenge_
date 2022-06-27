package com.cbagames.tmdb_challenge.databinding;
import com.cbagames.tmdb_challenge.R;
import com.cbagames.tmdb_challenge.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.cbagames.tmdb_challenge.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 5);
        sViewsWithIds.put(R.id.tvMostpopular, 6);
        sViewsWithIds.put(R.id.ButtonsLayout, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[7]
            , (androidx.appcompat.widget.Toolbar) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[1]
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (androidx.recyclerview.widget.RecyclerView) bindings[4];
        this.mboundView4.setTag(null);
        this.tvSearchMovies.setTag(null);
        this.tvSearchPeople.setTag(null);
        this.tvSearchTv.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.cbagames.tmdb_challenge.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.cbagames.tmdb_challenge.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.cbagames.tmdb_challenge.generated.callback.OnClickListener(this, 2);
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
        if (BR.mainActivityObject == variableId) {
            setMainActivityObject((com.cbagames.tmdb_challenge.MainActivity) variable);
        }
        else if (BR.moviesAdapter == variableId) {
            setMoviesAdapter((com.cbagames.tmdb_challenge.MainActivityMoviesAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMainActivityObject(@Nullable com.cbagames.tmdb_challenge.MainActivity MainActivityObject) {
        this.mMainActivityObject = MainActivityObject;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mainActivityObject);
        super.requestRebind();
    }
    public void setMoviesAdapter(@Nullable com.cbagames.tmdb_challenge.MainActivityMoviesAdapter MoviesAdapter) {
        this.mMoviesAdapter = MoviesAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.moviesAdapter);
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
        com.cbagames.tmdb_challenge.MainActivity mainActivityObject = mMainActivityObject;
        com.cbagames.tmdb_challenge.MainActivityMoviesAdapter moviesAdapter = mMoviesAdapter;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView4.setAdapter(moviesAdapter);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.tvSearchMovies.setOnClickListener(mCallback1);
            this.tvSearchPeople.setOnClickListener(mCallback2);
            this.tvSearchTv.setOnClickListener(mCallback3);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // mainActivityObject
                com.cbagames.tmdb_challenge.MainActivity mainActivityObject = mMainActivityObject;
                // mainActivityObject != null
                boolean mainActivityObjectJavaLangObjectNull = false;



                mainActivityObjectJavaLangObjectNull = (mainActivityObject) != (null);
                if (mainActivityObjectJavaLangObjectNull) {


                    mainActivityObject.searchTvButton();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // mainActivityObject
                com.cbagames.tmdb_challenge.MainActivity mainActivityObject = mMainActivityObject;
                // mainActivityObject != null
                boolean mainActivityObjectJavaLangObjectNull = false;



                mainActivityObjectJavaLangObjectNull = (mainActivityObject) != (null);
                if (mainActivityObjectJavaLangObjectNull) {


                    mainActivityObject.searchMovieButton();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // mainActivityObject
                com.cbagames.tmdb_challenge.MainActivity mainActivityObject = mMainActivityObject;
                // mainActivityObject != null
                boolean mainActivityObjectJavaLangObjectNull = false;



                mainActivityObjectJavaLangObjectNull = (mainActivityObject) != (null);
                if (mainActivityObjectJavaLangObjectNull) {


                    mainActivityObject.searchPersonButton();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainActivityObject
        flag 1 (0x2L): moviesAdapter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}