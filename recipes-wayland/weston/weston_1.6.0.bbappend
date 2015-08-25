FILESEXTRAPATHS_prepend := "${THISDIR}/weston_sample"

RDEPENDS_${PN} += "weston-examples"

SRC_URI = "\
	file://weston_sample_load \
	file://weston.ini \
	file://Chrysanthemum.png \
	file://Desert.png \
	file://Hydrangeas.png \
	file://Jellyfish.png \
	file://Koala.png \
	file://Lighthouse.png \
	file://Penguins.png \
	file://Tulips.png \
"

do_install_append() {
  install -d ${D}${sysconfdir}/init.d/
  install -m 0755 ${WORKDIR}/weston_sample_load ${D}${sysconfdir}/init.d/weston_sample_load

  install -d ${D}${datadir}/weston_sample
  install -m 0644 ${WORKDIR}/weston.ini        ${D}${datadir}/weston_sample/
  install -m 0644 ${WORKDIR}/Chrysanthemum.png ${D}${datadir}/weston_sample/
  install -m 0644 ${WORKDIR}/Desert.png        ${D}${datadir}/weston_sample/
  install -m 0644 ${WORKDIR}/Jellyfish.png     ${D}${datadir}/weston_sample/
  install -m 0644 ${WORKDIR}/Koala.png         ${D}${datadir}/weston_sample/
  install -m 0644 ${WORKDIR}/Lighthouse.png    ${D}${datadir}/weston_sample/
  install -m 0644 ${WORKDIR}/Penguins.png      ${D}${datadir}/weston_sample/
  install -m 0644 ${WORKDIR}/Tulips.png        ${D}${datadir}/weston_sample/
}

inherit update-rc.d

INITSCRIPT_NAME = "weston_sample_load"
INITSCRIPT_PARAMS = "start 60 5 2 ."

FILES_${PN} += "${sysconfdir}"



