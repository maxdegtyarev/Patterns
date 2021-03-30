package guy.maxim.builder

import guy.maxim.bridge.{Laptop, MacBookLaptop, PersonalLaptop, PortableLaptop, Processor}

trait Builder {
  def reset() : Unit
  def setProcessor(processor: Option[Processor]) : Unit
  def setModelId(id: Int)
  def getDevice() : Laptop
}


class MacBookBuilder(var device : Laptop = new MacBookLaptop(None)) extends Builder {

  override def reset(): Unit = { this.device = new MacBookLaptop(None) }

  override def setProcessor(processor: Option[Processor]): Unit = this.device.setProcessor(processor)

  override def setModelId(id: Int): Unit = this.device.setModeId(id)

  override def getDevice(): Laptop = this.device
}

class IBMPCBuilder(var device : Laptop = new PersonalLaptop(None)) extends Builder {

  override def reset(): Unit = { this.device = new PersonalLaptop(None) }

  override def setProcessor(processor: Option[Processor]): Unit = this.device.setProcessor(processor)

  override def setModelId(id: Int): Unit = this.device.setModeId(id)

  override def getDevice(): Laptop = this.device
}

class PortableComputerBuilder(var device : Laptop = new PortableLaptop(None)) extends Builder {

  override def reset(): Unit = { this.device = new PortableLaptop(None) }

  override def setProcessor(processor: Option[Processor]): Unit = this.device.setProcessor(processor)

  override def setModelId(id: Int): Unit = this.device.setModeId(id)

  override def getDevice(): Laptop = this.device
}