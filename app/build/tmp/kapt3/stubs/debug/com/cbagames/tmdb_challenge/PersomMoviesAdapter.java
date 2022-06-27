package com.cbagames.tmdb_challenge;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/cbagames/tmdb_challenge/PersomMoviesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/cbagames/tmdb_challenge/PersomMoviesAdapter$CardHendeler;", "mContext", "Landroid/content/Context;", "videosList", "", "Lcom/cbagames/tmdb_challenge/Videos;", "(Landroid/content/Context;Ljava/util/List;)V", "getMContext", "()Landroid/content/Context;", "getVideosList", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CardHendeler", "app_debug"})
public final class PersomMoviesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.cbagames.tmdb_challenge.PersomMoviesAdapter.CardHendeler> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.cbagames.tmdb_challenge.Videos> videosList = null;
    
    public PersomMoviesAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.util.List<com.cbagames.tmdb_challenge.Videos> videosList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.cbagames.tmdb_challenge.Videos> getVideosList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.cbagames.tmdb_challenge.PersomMoviesAdapter.CardHendeler onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.cbagames.tmdb_challenge.PersomMoviesAdapter.CardHendeler holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/cbagames/tmdb_challenge/PersomMoviesAdapter$CardHendeler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "cardBinding", "Lcom/cbagames/tmdb_challenge/databinding/PersonMoviesCardBinding;", "(Lcom/cbagames/tmdb_challenge/PersomMoviesAdapter;Lcom/cbagames/tmdb_challenge/databinding/PersonMoviesCardBinding;)V", "CardBinding", "getCardBinding", "()Lcom/cbagames/tmdb_challenge/databinding/PersonMoviesCardBinding;", "setCardBinding", "(Lcom/cbagames/tmdb_challenge/databinding/PersonMoviesCardBinding;)V", "app_debug"})
    public final class CardHendeler extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.cbagames.tmdb_challenge.databinding.PersonMoviesCardBinding CardBinding;
        
        public CardHendeler(@org.jetbrains.annotations.NotNull()
        com.cbagames.tmdb_challenge.databinding.PersonMoviesCardBinding cardBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.cbagames.tmdb_challenge.databinding.PersonMoviesCardBinding getCardBinding() {
            return null;
        }
        
        public final void setCardBinding(@org.jetbrains.annotations.NotNull()
        com.cbagames.tmdb_challenge.databinding.PersonMoviesCardBinding p0) {
        }
    }
}