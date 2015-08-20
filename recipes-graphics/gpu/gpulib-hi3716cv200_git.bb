DISCRIPTION = "Mali GPU libraries for HI3716CV200"
LICENSE = "Proprietary"

LIC_FILES_CHKSUM = "file://LICENCE;md5=427429c3f0211c2090febdeac0f46d76"


PROVIDES = "virtual/libgles1 virtual/libgles2 virtual/egl"
COMPATIBLE_MACHINE = "hi3716cv200"

DEPENDS += "wayland"

#SRCREV = "8a702a68def1ef703ea509cad8a139e1d5c2e20b"
SRCREV = "8f1335eba49ac6781cb44b385ba132a2cc6caa88"

SRC_URI = "\
	git://github.com/hisilicon/x5hd2-gpu-libs.git;branch=wayland;protocol=https \
	file://egl.pc \
	file://glesv2.pc \
	file://wayland-egl.pc \
"

S = "${WORKDIR}/git"

PV = "1.0+gitr${SRCPV}"

inherit pkgconfig

do_install () {
  install -d ${D}${libdir}
  cp -a lib/* ${D}${libdir}

  install -d ${D}${includedir}
  cp -r include/* ${D}${includedir}

  install -d ${D}${libdir}/pkgconfig
  install -m 0644 ${WORKDIR}/*.pc ${D}${libdir}/pkgconfig/
}

# These are proprietary binaries generated elsewhere so don't check ldflags
#INSANE_SKIP_${PN} = "ldflags textrel"

INSANE_SKIP_${PN} += "ldflags dev-so"

inherit lib_package


FILES_${PN} = "${libdir}"
FILES_${PN}-dev = "${includedir}"

#FILES_${PN} = "${libdir}/libMali.so \
#              ${libdir}/libEGL*.so.* \
#              ${libdir}/libGLES*.so.* \
#              ${libdir}/libEGL.so \ 
#              ${libdir}/libGLESv2.so \ 
#              ${libdir}/libGLESv1_CM.so \ 
#	      "
#FILES_${PN}-dev = "${includedir} \
#                 "
                
PACKAGE_ARCH = "${MACHINE_ARCH}"
