FILESEXTRAPATHS_prepend := "${THISDIR}/qtwayland:"

#SRC_URI_append += " \
#    file://changecode_eglext_suitfor_test.patch \
#    "

PACKAGES += "${PN}-plugins"

#DEPENDS += " wayland-egl"
LDFLAGS += " -lwayland-egl"
OE_QMAKE_CXXFLAGS += " -DEGL_PLATFORM_WAYLAND "
#OE_QMAKE_CFLAGS += " -DEGL_PLATFORM_WAYLAND "
#CPPFLAGS += " -DEGL_PLATFORM_WAYLAND "
#MAKEFLAGS += " -DEGL_PLATFORM_WAYLAND "


#RDEPENDS_${PN} += " "
#PACKAGE_ARCH = "${MACHINE_ARCH}"


