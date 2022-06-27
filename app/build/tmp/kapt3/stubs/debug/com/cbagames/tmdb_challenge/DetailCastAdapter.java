package com.cbagames.tmdb_challenge;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/cbagames/tmdb_challenge/DetailCastAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/cbagames/tmdb_challenge/DetailCastAdapter$CardHendeler;", "mContext", "Landroid/content/Context;", "personList", "", "Lcom/cbagames/tmdb_challenge/Person;", "(Landroid/content/Context;Ljava/util/List;)V", "getMContext", "()Landroid/content/Context;", "getPersonList", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "translate", "person", "CardHendeler", "app_debug"})
public final class DetailCastAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.cbagames.tmdb_challenge.DetailCastAdapter.CardHendeler> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.cbagames.tmdb_challenge.Person> personList = null;
    
    public DetailCastAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.util.List<com.cbagames.tmdb_challenge.Person> personList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.cbagames.tmdb_challenge.Person> getPersonList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.cbagames.tmdb_challenge.DetailCastAdapter.CardHendeler onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.cbagames.tmdb_challenge.DetailCastAdapter.CardHendeler holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void translate(@org.jetbrains.annotations.NotNull()
    com.cbagames.tmdb_challenge.Person person) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/cbagames/tmdb_challenge/DetailCastAdapter$CardHendeler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "cardBinding", "Lcom/cbagames/tmdb_challenge/databinding/DetailCastCardBinding;", "(Lcom/cbagames/tmdb_challenge/DetailCastAdapter;Lcom/cbagames/tmdb_challenge/databinding/DetailCastCardBinding;)V", "CardBinding", "getCardBinding", "()Lcom/cbagames/tmdb_challenge/databinding/DetailCastCardBinding;", "setCardBinding", "(Lcom/cbagames/tmdb_challenge/databinding/DetailCastCardBinding;)V", "app_debug"})
    public final class CardHendeler extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.cbagames.tmdb_challenge.databinding.DetailCastCardBinding CardBinding;
        
        public CardHendeler(@org.jetbrains.annotations.NotNull()
        com.cbagames.tmdb_challenge.databinding.DetailCastCardBinding cardBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.cbagames.tmdb_challenge.databinding.DetailCastCardBinding getCardBinding() {
            return null;
        }
        
        public final void setCardBinding(@org.jetbrains.annotations.NotNull()
        com.cbagames.tmdb_challenge.databinding.DetailCastCardBinding p0) {
        }
    }
}