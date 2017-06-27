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

  // public String printResults{
  //
  // }

  public boolean cheapEnough(int maxPrice) {
    return (mPrice <= maxPrice);
  }

  public boolean searchByArtist(String artistName) {
    return (mArtistName.equals(artistName));
  }

  public boolean searchByReleaseYear(int releaseStartYear, int releaseEndYear) {
    return ((mReleaseYear >= releaseStartYear) && (mReleaseYear <= releaseEndYear));
  }
}
