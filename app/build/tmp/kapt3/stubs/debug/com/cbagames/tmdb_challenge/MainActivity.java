package com.cbagames.tmdb_challenge;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010&\u001a\u00020\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0016J\u0006\u0010\'\u001a\u00020\u0015J\u0006\u0010(\u001a\u00020\u0015J\u0006\u0010)\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0007j\b\u0012\u0004\u0012\u00020\r`\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/cbagames/tmdb_challenge/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "()V", "adapter", "Lcom/cbagames/tmdb_challenge/MainActivityMoviesAdapter;", "cardsList", "Ljava/util/ArrayList;", "Lcom/cbagames/tmdb_challenge/Cards;", "Lkotlin/collections/ArrayList;", "dataBinding", "Lcom/cbagames/tmdb_challenge/databinding/ActivityMainBinding;", "movieList", "Lcom/cbagames/tmdb_challenge/Movies;", "getMovieList", "()Ljava/util/ArrayList;", "setMovieList", "(Ljava/util/ArrayList;)V", "searchWord", "", "getDataWithVolleyMovie", "", "category", "query", "getDataWithVolleyPerson", "getDataWithVolleyTv", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onQueryTextChange", "newText", "onQueryTextSubmit", "searchMovieButton", "searchPersonButton", "searchTvButton", "translateByMovieObject", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements androidx.appcompat.widget.SearchView.OnQueryTextListener {
    private java.util.ArrayList<com.cbagames.tmdb_challenge.Cards> cardsList;
    public java.util.ArrayList<com.cbagames.tmdb_challenge.Movies> movieList;
    private com.cbagames.tmdb_challenge.MainActivityMoviesAdapter adapter;
    private com.cbagames.tmdb_challenge.databinding.ActivityMainBinding dataBinding;
    private java.lang.String searchWord;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.cbagames.tmdb_challenge.Movies> getMovieList() {
        return null;
    }
    
    public final void setMovieList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.cbagames.tmdb_challenge.Movies> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void getDataWithVolleyMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String newText) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void searchMovieButton() {
    }
    
    public final void searchPersonButton() {
    }
    
    public final void searchTvButton() {
    }
    
    private final void getDataWithVolleyPerson(java.lang.String query) {
    }
    
    private final void getDataWithVolleyTv(java.lang.String query) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/cbagames/tmdb_challenge/MainActivity$translateByMovieObject;", "", "pets", "", "Lcom/cbagames/tmdb_challenge/Movies;", "(Ljava/util/List;)V", "getPets", "()Ljava/util/List;", "app_debug"})
    public static final class translateByMovieObject {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.cbagames.tmdb_challenge.Movies> pets = null;
        
        public translateByMovieObject() {
            super();
        }
        
        public translateByMovieObject(@org.jetbrains.annotations.NotNull()
        java.util.List<com.cbagames.tmdb_challenge.Movies> pets) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.cbagames.tmdb_challenge.Movies> getPets() {
            return null;
        }
    }
}