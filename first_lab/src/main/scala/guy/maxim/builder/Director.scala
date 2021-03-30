package guy.maxim.builder

import guy.maxim.bridge.{LowCostProcessor, RingProcessor, StandardProcessor}

import scala.util.Random

class Director {

  def createStandardLaptop(builder: Builder) : Unit = {
    builder.reset()
    builder.setProcessor(Some(new StandardProcessor))
    builder.setModelId(new Random().between(1000, 2000))
  }

  def createUnstandardLaptop(builder : Builder) : Unit = {
    builder.reset()
    builder.setProcessor(Some(new RingProcessor))
    builder.setModelId(new Random().between(2001, 3001))
  }

  def createLowCostLaptop(builder : Builder) : Unit = {
    builder.reset()
    builder.setProcessor(Some(new LowCostProcessor))
    builder.setModelId(new Random().between(3002,4003))
  }
}

