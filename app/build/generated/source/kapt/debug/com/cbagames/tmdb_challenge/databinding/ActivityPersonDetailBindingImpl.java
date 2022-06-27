package com.cbagames.tmdb_challenge.databinding;
import com.cbagames.tmdb_challenge.R;
import com.cbagames.tmdb_challenge.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPersonDetailBindingImpl extends ActivityPersonDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView2, 6);
        sViewsWithIds.put(R.id.linearLayoutView, 7);
        sViewsWithIds.put(R.id.ivBackground, 8);
        sViewsWithIds.put(R.id.ivPersonImage, 9);
        sViewsWithIds.put(R.id.textView2, 10);
        sViewsWithIds.put(R.id.textView4, 11);
        sViewsWithIds.put(R.id.textView5, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPersonDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityPersonDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.LinearLayout) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (android.widget.ScrollView) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvMoviePerson.setTag(null);
        this.rvTv.setTag(null);
        this.textView22.setTag(null);
        this.textView3.setTag(null);
        this.tvName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.personMovieAdapter == variableId) {
            setPersonMovieAdapter((com.cbagames.tmdb_challenge.PersomMoviesAdapter) variable);
        }
        else if (BR.personDetail == variableId) {
            setPersonDetail((com.cbagames.tmdb_challenge.Person) variable);
        }
        else if (BR.personTVAdapter == variableId) {
            setPersonTVAdapter((com.cbagames.tmdb_challenge.PersonTvAdapter) variable);
        }
        else if (BR.byography == variableId) {
            setByography((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPersonMovieAdapter(@Nullable com.cbagames.tmdb_challenge.PersomMoviesAdapter PersonMovieAdapter) {
        this.mPersonMovieAdapter = PersonMovieAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.personMovieAdapter);
        super.requestRebind();
    }
    public void setPersonDetail(@Nullable com.cbagames.tmdb_challenge.Person PersonDetail) {
        this.mPersonDetail = PersonDetail;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.personDetail);
        super.requestRebind();
    }
    public void setPersonTVAdapter(@Nullable com.cbagames.tmdb_challenge.PersonTvAdapter PersonTVAdapter) {
        this.mPersonTVAdapter = PersonTVAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.personTVAdapter);
        super.requestRebind();
    }
    public void setByography(@Nullable java.lang.String Byography) {
        this.mByography = Byography;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.byography);
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
        com.cbagames.tmdb_challenge.PersomMoviesAdapter personMovieAdapter = mPersonMovieAdapter;
        com.cbagames.tmdb_challenge.Person personDetail = mPersonDetail;
        com.cbagames.tmdb_challenge.PersonTvAdapter personTVAdapter = mPersonTVAdapter;
        java.lang.String personDetailName = null;
        java.lang.String byography = mByography;
        java.lang.String personDetailKnownForDepartment = null;

        if ((dirtyFlags & 0x11L) != 0) {
        }
        if ((dirtyFlags & 0x12L) != 0) {



                if (personDetail != null) {
                    // read personDetail.name
                    personDetailName = personDetail.getName();
                    // read personDetail.known_for_department
                    personDetailKnownForDepartment = personDetail.getKnown_for_department();
                }
        }
        if ((dirtyFlags & 0x14L) != 0) {
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.rvMoviePerson.setAdapter(personMovieAdapter);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.rvTv.setAdapter(personTVAdapter);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView22, personDetailKnownForDepartment);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, personDetailName);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView3, byography);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): personMovieAdapter
        flag 1 (0x2L): personDetail
        flag 2 (0x3L): personTVAdapter
        flag 3 (0x4L): byography
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}