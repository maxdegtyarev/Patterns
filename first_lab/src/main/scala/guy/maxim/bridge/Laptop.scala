package guy.maxim.bridge

import com.sun.tools.javac.main.Option.InvalidValueException

import scala.util.Random

abstract class Laptop(protected var processor: Option[Processor], protected var model_id: Int = 0) {

  def this(processor: Option[Processor]) = {
    this(processor, new Random().between(1000, 2000))
  }

  def this() = {
    this(None)
  }

  def drawResult(value: Int): Unit

  def checkProcessor(): Boolean = {
    if (!processor.isEmpty) true else throw new InvalidValueException("Processor is not defined")
  }

  def setProcessor(processor: Option[Processor]): Unit = {
    this.processor = processor
  }

  def setModeId(id: Int) : Unit = {
    this.model_id = id
  }

  def operationA(x: Int, y: Int): Unit = {
    checkProcessor()
    drawResult(processor.get.add(x, y))
  }

  def operationB(x: Int, y: Int): Unit = {
    checkProcessor()
    drawResult(processor.get.mul(x, y))
  }
}

class PersonalLaptop(pr_r: Option[Processor]) extends Laptop(pr_r) {
  override def drawResult(value: Int): Unit = {
    println(s"[DRAW MESSAGE] Laptop output: $value, processor: ${processor.get.getProcessorName}")
  }
}

class PortableLaptop(pr_r: Option[Processor]) extends Laptop(pr_r) {
  override def drawResult(value: Int): Unit = {
    println(s"[PORTABLE DISPLAY] Current output: $value, ${processor.get.getProcessorName}")
  }
}

class MacBookLaptop(pr_r: Option[Processor]) extends Laptop(pr_r) {
  override def drawResult(value: Int): Unit = {
    println(s"[MACBOOK OUTPUT] This value: $value, Processor: ${processor.get.getProcessorName}")
  }
}