package lectures.operators

import lectures.functions.{Computation, CurriedComputation, Data, FunctionalComputation}

/**
  * В задачке из lectures.functions.Computations, мы реализовали
  * один и тот же метод 3-я разными способами
  *
  * Пришло время оценить на сколько разные имплементации
  * отличаются друг от друга по производительности
  *
  * Для этого, раскомментируйте код, выполните в циклах вызов 3-х имплементаций
  * Оцените разницу во времени выполнения и объясните ее происхожение
  *
  */
object EvaluateOptimization extends App with Data {

  val startTimestamp = System.currentTimeMillis()


  //   ВЫПОЛНИТЬ В ЦИКЛЕ  ОТ 1 ДО 100 Computation.computation(
  for(_ <- 1 to 100) {
    Computation.computation(filterData, dataArray)
    println("elapsed time in Computation.computation" + (System.currentTimeMillis() - startTimestamp))
  }

  //   ВЫПОЛНИТЬ В ЦИКЛЕ  ОТ 1 ДО 100 CurriedComputation.partiallyAppliedCurriedFunction(
  val curriedStart = System.currentTimeMillis()
  for(_ <- 1 to 100) {
    CurriedComputation.partiallyAppliedCurriedFunction(dataArray)
    println("elapsed time " + (System.currentTimeMillis() - startTimestamp))
  }

  //   ВЫПОЛНИТЬ В ЦИКЛЕ  ОТ 1 ДО 100 FunctionalComputation.filterApplied
  val curriedEnd = System.currentTimeMillis()
  val funcStart = curriedEnd
  for(_ <- 1 to 100) {
    FunctionalComputation.filterApplied(dataArray)
    println("elapsed time " + (System.currentTimeMillis() - startTimestamp))
  }

  val funcEnd = System.currentTimeMillis()

  //   ВЫВЕСТИ РАЗНИЦУ В ПРОДОЛЖИТЕЛЬНОСТИ ВЫПОЛНЕНИЯ МЕЖДУ КАРРИРОВАННОЙ ВЕРСИЕЙ
  //   И ФУНКЦИОНАЛЬНОЙ

  val diff = ((curriedEnd - curriedStart).toInt - (funcEnd - funcStart).toInt) / 100

  println(s"Difference is about $diff milliseconds")
}

