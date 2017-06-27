class Triangle {
  public float mSide1;
  public float mSide2;
  public float mSide3;
  public String mType;

  public Triangle(float side1, float side2, float side3) {
    mSide1 = side1;
    mSide2 = side2;
    mSide3 = side3;
  }

  public void calculateType() {
    if(mSide1 + mSide2 < mSide3 || mSide2 + mSide3 < mSide1 || mSide1 + mSide3 < mSide2) {
      mType = "Not a Triangle";
    } else if(mSide1 == mSide2 && mSide1 == mSide3) {
      mType = "Equilateral Triangle";
    } else if((mSide1 == mSide2 && mSide1 != mSide3) || (mSide2 == mSide3 && mSide2 != mSide1)) {
      mType = "Isosceles Triangle";
    } else {
      mType = "Scalene Triangle";
    }
  }
}
