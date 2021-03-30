package guy.maxim.singlefactory

import guy.maxim.bridge.{Laptop}
import guy.maxim.builder.{Director, IBMPCBuilder, MacBookBuilder, PortableComputerBuilder}

trait LaptopFactory {
  val director = new Director()

  def createMacBook : Laptop

  def createPersonalLaptop : Laptop

  def createPortableLaptop : Laptop
}

object LowCostLaptopFactory extends LaptopFactory {

  override def createMacBook: Laptop = {
    val builder = new MacBookBuilder
    director.createLowCostLaptop(builder)
    builder.getDevice()
  }

  def createPersonalLaptop : Laptop = {
    val builder = new IBMPCBuilder
    director.createLowCostLaptop(builder)
    builder.getDevice()
  }

  override def createPortableLaptop: Laptop = {
    val builder = new PortableComputerBuilder
    director.createLowCostLaptop(builder)
    builder.getDevice()
  }
}

object MainSectorLaptopFactory extends LaptopFactory {
  override def createMacBook: Laptop = {
    val builder = new MacBookBuilder
    director.createStandardLaptop(builder)
    builder.getDevice()
  }

  def createPersonalLaptop : Laptop = {
    val builder = new IBMPCBuilder
    director.createStandardLaptop(builder)
    builder.getDevice()
  }

  override def createPortableLaptop: Laptop = {
    val builder = new PortableComputerBuilder
    director.createStandardLaptop(builder)
    builder.getDevice()
  }
}

object ModularSectorLaptopFactory extends LaptopFactory {
  override def createMacBook: Laptop = {
    val builder = new MacBookBuilder
    director.createUnstandardLaptop(builder)
    builder.getDevice()
  }

  def createPersonalLaptop : Laptop = {
    val builder = new IBMPCBuilder
    director.createUnstandardLaptop(builder)
    builder.getDevice()
  }

  override def createPortableLaptop: Laptop = {
    val builder = new PortableComputerBuilder
    director.createUnstandardLaptop(builder)
    builder.getDevice()
  }
}