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

  public boolean cheapEnough(int maxPrice) {
    return (mPrice <= maxPrice);
  }

  public boolean searchByArtist(String artistName) {
    return (mArtistName.equals(artistName));
  }

  public boolean searchByReleaseYear(int releaseYear) {
    return (mReleaseYear <= releaseYear);
  }
}
