package com.cbagames.tmdb_challenge;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/cbagames/tmdb_challenge/PersonDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/cbagames/tmdb_challenge/PersomMoviesAdapter;", "adapterTV", "Lcom/cbagames/tmdb_challenge/PersonTvAdapter;", "dataBinding", "Lcom/cbagames/tmdb_challenge/databinding/ActivityPersonDetailBinding;", "videosList", "Ljava/util/ArrayList;", "Lcom/cbagames/tmdb_challenge/Videos;", "Lkotlin/collections/ArrayList;", "videosTVList", "getDataWithVolleyForByography", "", "serarcWord", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "videoSend", "pers", "Lcom/cbagames/tmdb_challenge/Person;", "app_debug"})
public final class PersonDetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.util.ArrayList<com.cbagames.tmdb_challenge.Videos> videosList;
    private com.cbagames.tmdb_challenge.PersomMoviesAdapter adapter;
    private java.util.ArrayList<com.cbagames.tmdb_challenge.Videos> videosTVList;
    private com.cbagames.tmdb_challenge.PersonTvAdapter adapterTV;
    private com.cbagames.tmdb_challenge.databinding.ActivityPersonDetailBinding dataBinding;
    
    public PersonDetailActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void videoSend(@org.jetbrains.annotations.NotNull()
    com.cbagames.tmdb_challenge.Person pers) {
    }
    
    public final void getDataWithVolleyForByography(@org.jetbrains.annotations.NotNull()
    java.lang.String serarcWord) {
    }
}