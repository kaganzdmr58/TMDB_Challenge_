package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.cbagames.tmdb_challenge.DataBinderMapperImpl());
  }
}
