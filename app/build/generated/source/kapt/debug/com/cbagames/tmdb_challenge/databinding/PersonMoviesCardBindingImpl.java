package com.cbagames.tmdb_challenge.databinding;
import com.cbagames.tmdb_challenge.R;
import com.cbagames.tmdb_challenge.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PersonMoviesCardBindingImpl extends PersonMoviesCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardPersonMovie, 2);
        sViewsWithIds.put(R.id.ivPersonMovie, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PersonMoviesCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private PersonMoviesCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvPersonMovie.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.PersonMovieCard == variableId) {
            setPersonMovieCard((com.cbagames.tmdb_challenge.Videos) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPersonMovieCard(@Nullable com.cbagames.tmdb_challenge.Videos PersonMovieCard) {
        this.mPersonMovieCard = PersonMovieCard;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.PersonMovieCard);
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
        java.lang.String personMovieCardName = null;
        com.cbagames.tmdb_challenge.Videos personMovieCard = mPersonMovieCard;

        if ((dirtyFlags & 0x3L) != 0) {



                if (personMovieCard != null) {
                    // read PersonMovieCard.name
                    personMovieCardName = personMovieCard.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPersonMovie, personMovieCardName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): PersonMovieCard
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}