FILESEXTRAPATHS_prepend := "${THISDIR}/qtwebkit:"

PACKAGE_ARCH = "${MACHINE_ARCH}"

#DEPENDS += "wayland"
#LDFLAGS_append += " -lwayland-client"
OE_QMAKE_CXXFLAGS += " -DEGL_PLATFORM_FBDEV "

