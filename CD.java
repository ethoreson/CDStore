class CD {
  public String mArtistName;
  public String mAlbumName;
  public int mReleaseYear;
  public int mPrice;

  public CD(String artistName, String albumName, int releaseYear, int price) {
    mArtistName = artistName;
    mAlbumName = albumName;
    mReleaseYear = releaseYear;
    mPrice = price;
  }

  public String cheapEnough(int maxPrice) {
    return (mPrice <= maxPrice);
  }

  public String searchByArtist(String artistName) {
    return (mArtistName = artistName);
  }

  public String searchByReleaseYear(String releaseYear) {
    return (mReleaseYear <= releaseYear);
  }
}
