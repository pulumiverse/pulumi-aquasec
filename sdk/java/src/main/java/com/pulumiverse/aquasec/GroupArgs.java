// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupArgs Empty = new GroupArgs();

    /**
     * The desired name of the group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The desired name of the group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GroupArgs() {}

    private GroupArgs(GroupArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupArgs $;

        public Builder() {
            $ = new GroupArgs();
        }

        public Builder(GroupArgs defaults) {
            $ = new GroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The desired name of the group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The desired name of the group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GroupArgs build() {
            return $;
        }
    }

}
