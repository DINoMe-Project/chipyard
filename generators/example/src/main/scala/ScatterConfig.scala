package example
import chisel3._
import freechips.rocketchip.config.{Config}
class ScatterTinyBoomConfigS1W16 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithScatterTinyBooms(1,16) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class ScatterTinyBoomConfigS2W8 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithScatterTinyBooms(2,8) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system


class ScatterTinyBoomConfigS4W4 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithScatterTinyBooms(4,4) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class ScatterTinyBoomConfigS8W2 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithScatterTinyBooms(8,2) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system


class ScatterTinyBoomConfigS16W1 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithScatterTinyBooms(16,1) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system


class ScatterTinyBoomConfigS1W32 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithScatterTinyBooms(1,32) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class ScatterTinyBoomConfigS2W16 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithScatterTinyBooms(2,16) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system


class ScatterTinyBoomConfigS4W8 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithScatterTinyBooms(4,8) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class ScatterTinyBoomConfigS8W4 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithScatterTinyBooms(8,4) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system


class ScatterTinyBoomConfigS16W2 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithScatterTinyBooms(16,2) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system

class ScatterTinyBoomConfigS32W1 extends Config(
  new WithTop ++                                          // use normal top
  new boom.common.WithoutBoomFPU ++                        // no fp
  new boom.common.WithScatterTinyBooms(32,1) ++                         // 1-wide BOOM
  new boom.common.WithNBoomCores(1) ++                      // single-core
  new freechips.rocketchip.system.BaseConfig)               // "base" rocketchip system


