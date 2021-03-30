package guy.maxim.bridge

import java.util.InvalidPropertiesFormatException

trait Processor {

  def getProcessorName: String

  def getProcessorCores: Int

  def add(x: Int, y: Int): Int

  def mul(x: Int, y: Int): Int
}

class StandardProcessor extends Processor {

  override def getProcessorName: String = "Standard processor for default peoples"

  override def getProcessorCores: Int = 4

  override def add(x: Int, y: Int): Int = x + y

  override def mul(x: Int, y: Int): Int = x * y
}

class RingProcessor extends Processor {

  override def getProcessorName: String = "This is a special modular processor by 2"

  override def getProcessorCores: Int = 2

  override def add(x: Int, y: Int): Int = (x + y) % 2

  override def mul(x: Int, y: Int): Int = (x * y) % 2
}

class LowCostProcessor extends Processor {

  override def getProcessorName: String = "This is a simple processor for lowcost models"

  override def getProcessorCores: Int = 1

  override def add(x: Int, y: Int): Int = (x + y)

  override def mul(x: Int, y: Int): Int = throw new InvalidPropertiesFormatException("This processor does not support multiplication")
}
