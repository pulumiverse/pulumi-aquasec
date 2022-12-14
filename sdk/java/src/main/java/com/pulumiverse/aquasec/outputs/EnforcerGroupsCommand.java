// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnforcerGroupsCommand {
    private @Nullable String default_;
    private @Nullable String kubernetes;
    private @Nullable String swarm;
    private @Nullable String windows;

    private EnforcerGroupsCommand() {}
    public Optional<String> default_() {
        return Optional.ofNullable(this.default_);
    }
    public Optional<String> kubernetes() {
        return Optional.ofNullable(this.kubernetes);
    }
    public Optional<String> swarm() {
        return Optional.ofNullable(this.swarm);
    }
    public Optional<String> windows() {
        return Optional.ofNullable(this.windows);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnforcerGroupsCommand defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String default_;
        private @Nullable String kubernetes;
        private @Nullable String swarm;
        private @Nullable String windows;
        public Builder() {}
        public Builder(EnforcerGroupsCommand defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.kubernetes = defaults.kubernetes;
    	      this.swarm = defaults.swarm;
    	      this.windows = defaults.windows;
        }

        @CustomType.Setter("default")
        public Builder default_(@Nullable String default_) {
            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder kubernetes(@Nullable String kubernetes) {
            this.kubernetes = kubernetes;
            return this;
        }
        @CustomType.Setter
        public Builder swarm(@Nullable String swarm) {
            this.swarm = swarm;
            return this;
        }
        @CustomType.Setter
        public Builder windows(@Nullable String windows) {
            this.windows = windows;
            return this;
        }
        public EnforcerGroupsCommand build() {
            final var o = new EnforcerGroupsCommand();
            o.default_ = default_;
            o.kubernetes = kubernetes;
            o.swarm = swarm;
            o.windows = windows;
            return o;
        }
    }
}
