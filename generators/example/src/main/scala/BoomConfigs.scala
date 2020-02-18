package example

import chisel3._

import freechips.rocketchip.config.{Config}

// ---------------------
// BOOM Configs
// ---------------------
class TinyBoomConfig1 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithMyTinyBooms(1,32) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class TinyBoomConfig2 extends Config(
  //new WithExtMemSize(8096) ++
  new WithTop ++                                            // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithMyTinyBooms(2,16) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class TinyBoomConfig4 extends Config(
  //new WithExtMemSize(8096) ++
  new WithTop ++                                            // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithMyTinyBooms(4,8) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class TinyBoomConfig8 extends Config(
  
  //new WithExtMemSize(8096) ++
  new WithTop ++                                            // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithMyTinyBooms(8,4) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class TinyBoomConfig16 extends Config(
  
  //new WithExtMemSize(8096) ++
  new WithTop ++                                            // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithMyTinyBooms(16,2) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class TinyBoomConfig32 extends Config(
  
  //new WithExtMemSize(8096) ++
  new WithTop ++                                            // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithMyTinyBooms(32,1) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system


class SmallBoomConfig extends Config(
  new WithTop ++                                            // use normal top
  new WithBootROM ++                                        // use testchipip bootrom
  new freechips.rocketchip.subsystem.WithInclusiveCache ++  // use SiFive L2 cache
  new boom.common.WithSmallBooms ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class MediumBoomConfig extends Config(
  new WithTop ++
  new WithBootROM ++
  new freechips.rocketchip.subsystem.WithInclusiveCache ++
  new boom.common.WithMediumBooms ++                        // 2-wide BOOM
  new boom.common.WithNBoomCores(1) ++
  new freechips.rocketchip.system.BaseConfig)

class LargeBoomConfig extends Config(
  new WithTop ++
  new WithBootROM ++
  new freechips.rocketchip.subsystem.WithInclusiveCache ++
  new boom.common.WithLargeBooms ++                         // 3-wide BOOM
  new boom.common.WithNBoomCores(1) ++
  new freechips.rocketchip.system.BaseConfig)

class MegaBoomConfig extends Config(
  new WithTop ++
  new WithBootROM ++
  new freechips.rocketchip.subsystem.WithInclusiveCache ++
  new boom.common.WithMegaBooms ++                          // 4-wide BOOM
  new boom.common.WithNBoomCores(1) ++
  new freechips.rocketchip.system.BaseConfig)

class DualSmallBoomConfig extends Config(
  new WithTop ++
  new WithBootROM ++
  new freechips.rocketchip.subsystem.WithInclusiveCache ++
  new boom.common.WithSmallBooms ++
  new boom.common.WithNBoomCores(2) ++                      // dual-core
  new freechips.rocketchip.system.BaseConfig)

class SmallRV32BoomConfig extends Config(
  new WithTop ++
  new WithBootROM ++
  new freechips.rocketchip.subsystem.WithInclusiveCache ++
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithBoomRV32 ++                          // rv32 (32bit)
  new boom.common.WithSmallBooms ++
  new boom.common.WithNBoomCores(1) ++
  new freechips.rocketchip.system.BaseConfig)

class HwachaLargeBoomConfig extends Config(
  new WithTop ++
  new WithBootROM ++
  new freechips.rocketchip.subsystem.WithInclusiveCache ++
  new hwacha.DefaultHwachaConfig ++                         // use Hwacha vector accelerator
  new boom.common.WithLargeBooms ++                         // 3-wide BOOM
  new boom.common.WithNBoomCores(1) ++
  new freechips.rocketchip.system.BaseConfig)


