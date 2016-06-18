package com.practice
import scala.collection.immutable.ListMap
import java.util.Calendar
import java.util.GregorianCalendar

object CalendarApp extends App {

  var leapYear: Int = 0
  println("Enter the year to display calendar:")
  val year = readInt()

  if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {

    leapYear = 29

  } else {
    leapYear = 28

  }

  var mapCal = ListMap("January" -> 31, "February" -> leapYear, "March" -> 31, "April" -> 30, "May" -> 31, "June" -> 30, "July" -> 31, "August" -> 31, "September" -> 30, "October" -> 31, "November" -> 30, "December" -> 31)

  val cal = new printCal
  cal.printAllMonths(year, mapCal)

}
class printCal {
  val days: List[String] = List("Sun", "Mon", "Tue", "Wen", "Thu", "Fri", "Sat")

  var calendar = new GregorianCalendar()

  def printAllMonths(year: Int, months: ListMap[String, Int]) {
    var totalDays: Int = 0
    var i: Int = 0
    var monthIndex = 0
    var dayIndex = 0
    var break = 0
    var ans = true
    println("Year:" + year)
    for (months <- months) {
      println("\nMonth:" + months._1)

      calendar.set(year, monthIndex, 1);
      dayIndex = calendar.get(Calendar.DAY_OF_WEEK)
      break = dayIndex
      days.foreach { days => print(days.mkString + "\t") }
      println()

      while (break != 1) {
        print("\t")
        break -= 1
      }

      //i=dayIndex
      for (i <- 1 to months._2) {
        print(i + "\t")
        if (dayIndex % 7 == 0) {
          println()
        }
        dayIndex += 1
      }

      monthIndex += 1
    }
    // months.keys.foreach{i=>print(i.mkString+"=="+months(i))}
  }

}