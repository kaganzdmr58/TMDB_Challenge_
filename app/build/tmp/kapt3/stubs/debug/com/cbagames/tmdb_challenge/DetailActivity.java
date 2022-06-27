package com.cbagames.tmdb_challenge;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00100\fj\b\u0012\u0004\u0012\u00020\u0010`\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/cbagames/tmdb_challenge/DetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapterPerson", "Lcom/cbagames/tmdb_challenge/DetailCastAdapter;", "adapterVideos", "Lcom/cbagames/tmdb_challenge/DetailVideosAdapter;", "dataBinding", "Lcom/cbagames/tmdb_challenge/databinding/ActivityMovieDetailBinding;", "moviee", "Lcom/cbagames/tmdb_challenge/Movies;", "personList", "Ljava/util/ArrayList;", "Lcom/cbagames/tmdb_challenge/Person;", "Lkotlin/collections/ArrayList;", "videosList", "Lcom/cbagames/tmdb_challenge/Videos;", "getDataWithVolley", "", "getDataWithVolley_Videos", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "translate", "app_debug"})
public final class DetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.util.ArrayList<com.cbagames.tmdb_challenge.Person> personList;
    private com.cbagames.tmdb_challenge.DetailCastAdapter adapterPerson;
    private java.util.ArrayList<com.cbagames.tmdb_challenge.Videos> videosList;
    private com.cbagames.tmdb_challenge.DetailVideosAdapter adapterVideos;
    private com.cbagames.tmdb_challenge.databinding.ActivityMovieDetailBinding dataBinding;
    private com.cbagames.tmdb_challenge.Movies moviee;
    
    public DetailActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void translate(@org.jetbrains.annotations.NotNull()
    com.cbagames.tmdb_challenge.Movies moviee) {
    }
    
    public final void getDataWithVolley() {
    }
    
    public final void getDataWithVolley_Videos() {
    }
}