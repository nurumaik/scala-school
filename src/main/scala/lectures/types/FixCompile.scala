package lectures.types

/**
  * Программа должна удвоить все нечетные члены List и потом просуммировать,
  * сохранив результат в 'result'
  *
  * Ваша задача:
  * Раскомментируйте код
  * Исправьте тело метода mapper так, чтобы программа скопмилировалась
  */
object FixCompile extends App {

  val mapper = (i: Int) => if (i % 2 != 0) i * 2 else i

  val result = List(1, 2, 3, 4, 5, 6, 7, 8, 9).map {
    mapper
  }.sum

   print(result)
}

