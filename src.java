···java
 private void checkMedalAuthority() {

        if (com.zhongduomei.rrmj.society.common.utils.a.c()) {

            if (this.type == 1) {

                VideoDetailAction.addVideoDetail_Cache_DefinitionEvent(((ToVideoDownloadParcel) this.downloadUGCList.get(0)).getVideoId(), this.clarityCode[1]);

                TCAgent.onEvent(this.mActivity, VideoDetailAction.VideoDetail_Cache_Definition);

            }

            if (this.type == 2) {

                try {

                    MovieDetailAction.addDramaDownloadQualityEvent(this.clarityCode[1], String.valueOf(this.mSeasonDetailParcel.getSeason().getId()));

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

            if (this.onSpinnerItemClick != null) {

                this.onSpinnerItemClick.onClick(this.clarityCode[1]);

            }

            this.currentQuality = this.clarityCode[1];

            this.tv_quality1.setSelected(true);

            this.tv_quality2.setSelected(false);

            this.tv_quality3.setSelected(false);

        } else if (this.type == 2) {

            g.a(this.mActivity, String.valueOf(this.mSeasonDetailParcel.getSeason().getId()));

        } else {

            g.a(this.mActivity);

        }

    }

···
