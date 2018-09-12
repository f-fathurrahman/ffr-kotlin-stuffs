class Rectangle(
  val height: Int,
  val width: Int) {

  // The property isSquare does not need a field to store its value.
  // It only has a custom getter with the implementation provided.
  // The value is computer every time the property is accessed
  val isSquare: Boolean
    get() {
      println("Computing isSquare property")
      return height == width
    }

}
