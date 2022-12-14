// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnforcerGroupsCommandArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnforcerGroupsCommandArgs Empty = new EnforcerGroupsCommandArgs();

    @Import(name="default")
    private @Nullable Output<String> default_;

    public Optional<Output<String>> default_() {
        return Optional.ofNullable(this.default_);
    }

    @Import(name="kubernetes")
    private @Nullable Output<String> kubernetes;

    public Optional<Output<String>> kubernetes() {
        return Optional.ofNullable(this.kubernetes);
    }

    @Import(name="swarm")
    private @Nullable Output<String> swarm;

    public Optional<Output<String>> swarm() {
        return Optional.ofNullable(this.swarm);
    }

    @Import(name="windows")
    private @Nullable Output<String> windows;

    public Optional<Output<String>> windows() {
        return Optional.ofNullable(this.windows);
    }

    private EnforcerGroupsCommandArgs() {}

    private EnforcerGroupsCommandArgs(EnforcerGroupsCommandArgs $) {
        this.default_ = $.default_;
        this.kubernetes = $.kubernetes;
        this.swarm = $.swarm;
        this.windows = $.windows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnforcerGroupsCommandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnforcerGroupsCommandArgs $;

        public Builder() {
            $ = new EnforcerGroupsCommandArgs();
        }

        public Builder(EnforcerGroupsCommandArgs defaults) {
            $ = new EnforcerGroupsCommandArgs(Objects.requireNonNull(defaults));
        }

        public Builder default_(@Nullable Output<String> default_) {
            $.default_ = default_;
            return this;
        }

        public Builder default_(String default_) {
            return default_(Output.of(default_));
        }

        public Builder kubernetes(@Nullable Output<String> kubernetes) {
            $.kubernetes = kubernetes;
            return this;
        }

        public Builder kubernetes(String kubernetes) {
            return kubernetes(Output.of(kubernetes));
        }

        public Builder swarm(@Nullable Output<String> swarm) {
            $.swarm = swarm;
            return this;
        }

        public Builder swarm(String swarm) {
            return swarm(Output.of(swarm));
        }

        public Builder windows(@Nullable Output<String> windows) {
            $.windows = windows;
            return this;
        }

        public Builder windows(String windows) {
            return windows(Output.of(windows));
        }

        public EnforcerGroupsCommandArgs build() {
            return $;
        }
    }

}
